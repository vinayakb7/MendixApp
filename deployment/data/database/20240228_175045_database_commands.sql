DELETE FROM "mendixsystem$attribute"  WHERE "id" = '15139cdb-ad03-3ca3-8d34-a80f8254dca7';
CREATE TABLE "myfirstmodule$designation" (
	"id" BIGINT NOT NULL,
	"designationname" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('a0038b91-a68b-4948-b6de-c61a14bbeaf8', 'MyFirstModule.Designation', 'myfirstmodule$designation', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('9bfa516d-dbfc-4d8c-bf14-9897eb6189a0', 'a0038b91-a68b-4948-b6de-c61a14bbeaf8', 'DesignationName', 'designationname', 30, 200, '', false);
ALTER TABLE "myfirstmodule$organisation" DROP COLUMN "createddate";
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20240228 17:50:45';
