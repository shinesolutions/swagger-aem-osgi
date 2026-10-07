//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
  /// Returns a new [OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties] instance.
  OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties({
    this.totalWidth,
    this.colWidthName,
    this.colWidthResult,
    this.colWidthTiming,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? totalWidth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? colWidthName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? colWidthResult;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? colWidthTiming;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties &&
    other.totalWidth == totalWidth &&
    other.colWidthName == colWidthName &&
    other.colWidthResult == colWidthResult &&
    other.colWidthTiming == colWidthTiming;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (totalWidth == null ? 0 : totalWidth!.hashCode) +
    (colWidthName == null ? 0 : colWidthName!.hashCode) +
    (colWidthResult == null ? 0 : colWidthResult!.hashCode) +
    (colWidthTiming == null ? 0 : colWidthTiming!.hashCode);

  @override
  String toString() => 'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties[totalWidth=$totalWidth, colWidthName=$colWidthName, colWidthResult=$colWidthResult, colWidthTiming=$colWidthTiming]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.totalWidth != null) {
      json[r'totalWidth'] = this.totalWidth;
    } else {
      json[r'totalWidth'] = null;
    }
    if (this.colWidthName != null) {
      json[r'colWidthName'] = this.colWidthName;
    } else {
      json[r'colWidthName'] = null;
    }
    if (this.colWidthResult != null) {
      json[r'colWidthResult'] = this.colWidthResult;
    } else {
      json[r'colWidthResult'] = null;
    }
    if (this.colWidthTiming != null) {
      json[r'colWidthTiming'] = this.colWidthTiming;
    } else {
      json[r'colWidthTiming'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
        totalWidth: ConfigNodePropertyInteger.fromJson(json[r'totalWidth']),
        colWidthName: ConfigNodePropertyInteger.fromJson(json[r'colWidthName']),
        colWidthResult: ConfigNodePropertyInteger.fromJson(json[r'colWidthResult']),
        colWidthTiming: ConfigNodePropertyInteger.fromJson(json[r'colWidthTiming']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

