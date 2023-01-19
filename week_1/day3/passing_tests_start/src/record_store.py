def get_name(record_store):
    return record_store["name"]

def find_record_by_title(title, record_store):
    for record in record_store["records"]:
        if title == record["title"]:
            return record

def sell_record(record, record_store):
    record_store["money"] += record["price"]
    record_store["records"].remove(record)