//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
  /// Returns a new [OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties] instance.
  OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties({
    this.felixPeriodInventoryPeriodPrinterPeriodName,
    this.felixPeriodInventoryPeriodPrinterPeriodTitle,
    this.path,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? felixPeriodInventoryPeriodPrinterPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? felixPeriodInventoryPeriodPrinterPeriodTitle;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties &&
    other.felixPeriodInventoryPeriodPrinterPeriodName == felixPeriodInventoryPeriodPrinterPeriodName &&
    other.felixPeriodInventoryPeriodPrinterPeriodTitle == felixPeriodInventoryPeriodPrinterPeriodTitle &&
    other.path == path;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (felixPeriodInventoryPeriodPrinterPeriodName == null ? 0 : felixPeriodInventoryPeriodPrinterPeriodName!.hashCode) +
    (felixPeriodInventoryPeriodPrinterPeriodTitle == null ? 0 : felixPeriodInventoryPeriodPrinterPeriodTitle!.hashCode) +
    (path == null ? 0 : path!.hashCode);

  @override
  String toString() => 'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties[felixPeriodInventoryPeriodPrinterPeriodName=$felixPeriodInventoryPeriodPrinterPeriodName, felixPeriodInventoryPeriodPrinterPeriodTitle=$felixPeriodInventoryPeriodPrinterPeriodTitle, path=$path]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.felixPeriodInventoryPeriodPrinterPeriodName != null) {
      json[r'felix.inventory.printer.name'] = this.felixPeriodInventoryPeriodPrinterPeriodName;
    } else {
      json[r'felix.inventory.printer.name'] = null;
    }
    if (this.felixPeriodInventoryPeriodPrinterPeriodTitle != null) {
      json[r'felix.inventory.printer.title'] = this.felixPeriodInventoryPeriodPrinterPeriodTitle;
    } else {
      json[r'felix.inventory.printer.title'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(
        felixPeriodInventoryPeriodPrinterPeriodName: ConfigNodePropertyString.fromJson(json[r'felix.inventory.printer.name']),
        felixPeriodInventoryPeriodPrinterPeriodTitle: ConfigNodePropertyString.fromJson(json[r'felix.inventory.printer.title']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

