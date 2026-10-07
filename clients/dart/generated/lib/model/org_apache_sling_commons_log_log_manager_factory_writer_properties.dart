//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
  /// Returns a new [OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties] instance.
  OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties({
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties[orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile != null) {
      json[r'org.apache.sling.commons.log.file'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;
    } else {
      json[r'org.apache.sling.commons.log.file'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber != null) {
      json[r'org.apache.sling.commons.log.file.number'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber;
    } else {
      json[r'org.apache.sling.commons.log.file.number'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize != null) {
      json[r'org.apache.sling.commons.log.file.size'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize;
    } else {
      json[r'org.apache.sling.commons.log.file.size'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered != null) {
      json[r'org.apache.sling.commons.log.file.buffered'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered;
    } else {
      json[r'org.apache.sling.commons.log.file.buffered'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.commons.log.file']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber: ConfigNodePropertyInteger.fromJson(json[r'org.apache.sling.commons.log.file.number']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.commons.log.file.size']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered: ConfigNodePropertyBoolean.fromJson(json[r'org.apache.sling.commons.log.file.buffered']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

