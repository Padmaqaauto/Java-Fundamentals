package se.lexicon.practice.session4;

// COMPOSITION — "owns" (strong)

public class WorkContract {

    private final String startDate;
    private final String contractType;

    // Package-private — only Employee (same package) can call this
    public WorkContract(String startDate, String contractType) {
        this.startDate = startDate;
        this.contractType = contractType;
    }

    public String getDetails() {
        return contractType + " contract (Started: " + startDate + ")";
    }
}
