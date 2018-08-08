package command.impl.admin;


import command.impl.Command;

import javax.servlet.http.HttpServletRequest;

public class ProcessOrderCommand implements Command {


    private Boolean clientOrderStatus;
    private Integer idOrder;


    public ProcessOrderCommand() {
        
    }

    public ProcessOrderCommand(Boolean clientOrderStatus, Integer idOrder) {
        this.clientOrderStatus = clientOrderStatus;
        this.idOrder = idOrder;
    }

    @Override
    public String execute(HttpServletRequest req) {
        //update order
        // не забыть discont создать
        return null;
    }
}
