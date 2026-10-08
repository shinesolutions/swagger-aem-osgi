//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {
  /// Returns a new [ComAdobeGraniteLicenseImplLicenseCheckFilterProperties] instance.
  ComAdobeGraniteLicenseImplLicenseCheckFilterProperties({
    this.checkInternval,
    this.excludeIds,
    this.encryptPing,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? checkInternval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? excludeIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? encryptPing;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteLicenseImplLicenseCheckFilterProperties &&
    other.checkInternval == checkInternval &&
    other.excludeIds == excludeIds &&
    other.encryptPing == encryptPing;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (checkInternval == null ? 0 : checkInternval!.hashCode) +
    (excludeIds == null ? 0 : excludeIds!.hashCode) +
    (encryptPing == null ? 0 : encryptPing!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteLicenseImplLicenseCheckFilterProperties[checkInternval=$checkInternval, excludeIds=$excludeIds, encryptPing=$encryptPing]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.checkInternval != null) {
      json[r'checkInternval'] = this.checkInternval;
    } else {
      json[r'checkInternval'] = null;
    }
    if (this.excludeIds != null) {
      json[r'excludeIds'] = this.excludeIds;
    } else {
      json[r'excludeIds'] = null;
    }
    if (this.encryptPing != null) {
      json[r'encryptPing'] = this.encryptPing;
    } else {
      json[r'encryptPing'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteLicenseImplLicenseCheckFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteLicenseImplLicenseCheckFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(
        checkInternval: ConfigNodePropertyInteger.fromJson(json[r'checkInternval']),
        excludeIds: ConfigNodePropertyArray.fromJson(json[r'excludeIds']),
        encryptPing: ConfigNodePropertyBoolean.fromJson(json[r'encryptPing']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteLicenseImplLicenseCheckFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteLicenseImplLicenseCheckFilterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteLicenseImplLicenseCheckFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteLicenseImplLicenseCheckFilterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteLicenseImplLicenseCheckFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

