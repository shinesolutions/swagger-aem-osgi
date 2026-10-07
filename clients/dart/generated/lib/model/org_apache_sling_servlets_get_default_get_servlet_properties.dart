//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingServletsGetDefaultGetServletProperties {
  /// Returns a new [OrgApacheSlingServletsGetDefaultGetServletProperties] instance.
  OrgApacheSlingServletsGetDefaultGetServletProperties({
    this.aliases,
    this.index,
    this.indexPeriodFiles,
    this.enablePeriodHtml,
    this.enablePeriodJson,
    this.enablePeriodTxt,
    this.enablePeriodXml,
    this.jsonPeriodMaximumresults,
    this.ecmaSuport,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? aliases;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? index;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? indexPeriodFiles;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodHtml;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodJson;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodTxt;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodXml;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? jsonPeriodMaximumresults;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? ecmaSuport;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingServletsGetDefaultGetServletProperties &&
    other.aliases == aliases &&
    other.index == index &&
    other.indexPeriodFiles == indexPeriodFiles &&
    other.enablePeriodHtml == enablePeriodHtml &&
    other.enablePeriodJson == enablePeriodJson &&
    other.enablePeriodTxt == enablePeriodTxt &&
    other.enablePeriodXml == enablePeriodXml &&
    other.jsonPeriodMaximumresults == jsonPeriodMaximumresults &&
    other.ecmaSuport == ecmaSuport;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aliases == null ? 0 : aliases!.hashCode) +
    (index == null ? 0 : index!.hashCode) +
    (indexPeriodFiles == null ? 0 : indexPeriodFiles!.hashCode) +
    (enablePeriodHtml == null ? 0 : enablePeriodHtml!.hashCode) +
    (enablePeriodJson == null ? 0 : enablePeriodJson!.hashCode) +
    (enablePeriodTxt == null ? 0 : enablePeriodTxt!.hashCode) +
    (enablePeriodXml == null ? 0 : enablePeriodXml!.hashCode) +
    (jsonPeriodMaximumresults == null ? 0 : jsonPeriodMaximumresults!.hashCode) +
    (ecmaSuport == null ? 0 : ecmaSuport!.hashCode);

  @override
  String toString() => 'OrgApacheSlingServletsGetDefaultGetServletProperties[aliases=$aliases, index=$index, indexPeriodFiles=$indexPeriodFiles, enablePeriodHtml=$enablePeriodHtml, enablePeriodJson=$enablePeriodJson, enablePeriodTxt=$enablePeriodTxt, enablePeriodXml=$enablePeriodXml, jsonPeriodMaximumresults=$jsonPeriodMaximumresults, ecmaSuport=$ecmaSuport]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.aliases != null) {
      json[r'aliases'] = this.aliases;
    } else {
      json[r'aliases'] = null;
    }
    if (this.index != null) {
      json[r'index'] = this.index;
    } else {
      json[r'index'] = null;
    }
    if (this.indexPeriodFiles != null) {
      json[r'index.files'] = this.indexPeriodFiles;
    } else {
      json[r'index.files'] = null;
    }
    if (this.enablePeriodHtml != null) {
      json[r'enable.html'] = this.enablePeriodHtml;
    } else {
      json[r'enable.html'] = null;
    }
    if (this.enablePeriodJson != null) {
      json[r'enable.json'] = this.enablePeriodJson;
    } else {
      json[r'enable.json'] = null;
    }
    if (this.enablePeriodTxt != null) {
      json[r'enable.txt'] = this.enablePeriodTxt;
    } else {
      json[r'enable.txt'] = null;
    }
    if (this.enablePeriodXml != null) {
      json[r'enable.xml'] = this.enablePeriodXml;
    } else {
      json[r'enable.xml'] = null;
    }
    if (this.jsonPeriodMaximumresults != null) {
      json[r'json.maximumresults'] = this.jsonPeriodMaximumresults;
    } else {
      json[r'json.maximumresults'] = null;
    }
    if (this.ecmaSuport != null) {
      json[r'ecmaSuport'] = this.ecmaSuport;
    } else {
      json[r'ecmaSuport'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingServletsGetDefaultGetServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingServletsGetDefaultGetServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingServletsGetDefaultGetServletProperties(
        aliases: ConfigNodePropertyArray.fromJson(json[r'aliases']),
        index: ConfigNodePropertyBoolean.fromJson(json[r'index']),
        indexPeriodFiles: ConfigNodePropertyArray.fromJson(json[r'index.files']),
        enablePeriodHtml: ConfigNodePropertyBoolean.fromJson(json[r'enable.html']),
        enablePeriodJson: ConfigNodePropertyBoolean.fromJson(json[r'enable.json']),
        enablePeriodTxt: ConfigNodePropertyBoolean.fromJson(json[r'enable.txt']),
        enablePeriodXml: ConfigNodePropertyBoolean.fromJson(json[r'enable.xml']),
        jsonPeriodMaximumresults: ConfigNodePropertyInteger.fromJson(json[r'json.maximumresults']),
        ecmaSuport: ConfigNodePropertyBoolean.fromJson(json[r'ecmaSuport']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingServletsGetDefaultGetServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingServletsGetDefaultGetServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingServletsGetDefaultGetServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingServletsGetDefaultGetServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingServletsGetDefaultGetServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingServletsGetDefaultGetServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingServletsGetDefaultGetServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingServletsGetDefaultGetServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingServletsGetDefaultGetServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingServletsGetDefaultGetServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

