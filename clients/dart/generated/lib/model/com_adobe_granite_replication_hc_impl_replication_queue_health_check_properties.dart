//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {
  /// Returns a new [ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties] instance.
  ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties({
    this.numberPeriodOfPeriodRetriesPeriodAllowed,
    this.hcPeriodTags,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? numberPeriodOfPeriodRetriesPeriodAllowed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties &&
    other.numberPeriodOfPeriodRetriesPeriodAllowed == numberPeriodOfPeriodRetriesPeriodAllowed &&
    other.hcPeriodTags == hcPeriodTags;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (numberPeriodOfPeriodRetriesPeriodAllowed == null ? 0 : numberPeriodOfPeriodRetriesPeriodAllowed!.hashCode) +
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties[numberPeriodOfPeriodRetriesPeriodAllowed=$numberPeriodOfPeriodRetriesPeriodAllowed, hcPeriodTags=$hcPeriodTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.numberPeriodOfPeriodRetriesPeriodAllowed != null) {
      json[r'number.of.retries.allowed'] = this.numberPeriodOfPeriodRetriesPeriodAllowed;
    } else {
      json[r'number.of.retries.allowed'] = null;
    }
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(
        numberPeriodOfPeriodRetriesPeriodAllowed: ConfigNodePropertyInteger.fromJson(json[r'number.of.retries.allowed']),
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

