package behavioral.visitor;

import behavioral.visitor.models.Bank;
import behavioral.visitor.models.Company;
import behavioral.visitor.models.Resident;
import behavioral.visitor.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}

