package InventoryService;

import org.json.simple.JSONArray;

public interface InventoryServiceInterface {
    void writeFile(JSONArray array);
    JSONArray readFile();
    JSONArray editItems(JSONArray array,String name);
    JSONArray removeItems(JSONArray array,String name);
    void addItems(JSONArray array);
    void displayItems(JSONArray array);
    void totalWeightOfInventory(JSONArray array);
    void totalPriceOfInventory(JSONArray array);
}