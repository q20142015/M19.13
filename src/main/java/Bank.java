import java.util.HashMap;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts;
    private final Random random = new Random();

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: СЂРµР°Р»РёР·РѕРІР°С‚СЊ РјРµС‚РѕРґ. РњРµС‚РѕРґ РїРµСЂРµРІРѕРґРёС‚ РґРµРЅСЊРіРё РјРµР¶РґСѓ СЃС‡РµС‚Р°РјРё. Р•СЃР»Рё СЃСѓРјРјР° С‚СЂР°РЅР·Р°РєС†РёРё > 50000,
     * С‚Рѕ РїРѕСЃР»Рµ СЃРѕРІРµСЂС€РµРЅРёСЏ С‚СЂР°РЅР·Р°РєС†РёРё, РѕРЅР° РѕС‚РїСЂР°РІР»СЏРµС‚СЃСЏ РЅР° РїСЂРѕРІРµСЂРєСѓ РЎР»СѓР¶Р±Рµ Р‘РµР·РѕРїР°СЃРЅРѕСЃС‚Рё вЂ“ РІС‹Р·С‹РІР°РµС‚СЃСЏ
     * РјРµС‚РѕРґ isFraud. Р•СЃР»Рё РІРѕР·РІСЂР°С‰Р°РµС‚СЃСЏ true, С‚Рѕ РґРµР»Р°РµС‚СЃСЏ Р±Р»РѕРєРёСЂРѕРІРєР° СЃС‡РµС‚РѕРІ (РєР°Рє вЂ“ РЅР° РІР°С€Рµ
     * СѓСЃРјРѕС‚СЂРµРЅРёРµ)
     */
    public void transfer(String fromAccountNum, String toAccountNum, long amount) {

    }

    /**
     * TODO: СЂРµР°Р»РёР·РѕРІР°С‚СЊ РјРµС‚РѕРґ. Р’РѕР·РІСЂР°С‰Р°РµС‚ РѕСЃС‚Р°С‚РѕРє РЅР° СЃС‡С‘С‚Рµ.
     */
    public long getBalance(String accountNum) {
        return 0;
    }

    public long getSumAllAccounts() {
        return 0;
    }
}

