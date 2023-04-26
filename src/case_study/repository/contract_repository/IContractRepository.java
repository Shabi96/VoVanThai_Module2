package case_study.repository.contract_repository;

import case_study.model.contract.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getContractList();
    void addNewContract(Contract contract);
}
