import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    private List<String> addressList;
    private Set<String> addressSet;
    private Map<Integer, String> addressMap;

    public void setAddressList(List addressList) {
        this.addressList = addressList;
        this.addressList = addressList;
    }

    public List getAddressList() {
        return addressList;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Set getAddressSet() {
        return addressSet;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Map getAddressMap() {
        return addressMap;
    }
}
