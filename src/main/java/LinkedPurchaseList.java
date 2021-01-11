import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "purchaselist")
public class LinkedPurchaseList {
    @EmbeddedId
    private PurchaseListId purchaseListId;

    public PurchaseListId getPurchaseListId() {
        return purchaseListId;
    }

    public void setPurchaseListId(PurchaseListId purchaseListId) {
        this.purchaseListId = purchaseListId;
    }
}
