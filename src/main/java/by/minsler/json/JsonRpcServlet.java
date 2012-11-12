package by.minsler.json;

import org.json.rpc.server.JsonRpcExecutor;
import org.json.rpc.server.JsonRpcServletTransport;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonRpcServlet extends HttpServlet {

    private final JsonRpcExecutor executor;

    public JsonRpcServlet() {
        executor = bind();
    }

    private JsonRpcExecutor bind() {
        JsonRpcExecutor executor = new JsonRpcExecutor();

        Calculator calcImpl = new SimpleCalculatorImpl();
        DAO dao = new DSDAO();
        executor.addHandler("calc", calcImpl, Calculator.class);
        executor.addHandler("dao", dao,DAO.class);
        // add more services here

        return executor;
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        executor.execute(new JsonRpcServletTransport(req, resp));
    }

}