package case_study.repository.contract_repository;

import case_study.model.contract.Contract;

import java.util.List;
import java.util.Queue;

public interface IContractRepository {
    List<Contract> getContractList();
    void addNewContract(Contract contract);
    void editContract();
    int checkById(String id);
}
