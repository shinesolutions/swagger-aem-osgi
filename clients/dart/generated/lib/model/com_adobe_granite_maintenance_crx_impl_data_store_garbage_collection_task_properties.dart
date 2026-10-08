//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {
  /// Returns a new [ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties] instance.
  ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties({
    this.granitePeriodMaintenancePeriodMandatory,
    this.jobPeriodTopics,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodMaintenancePeriodMandatory;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jobPeriodTopics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties &&
    other.granitePeriodMaintenancePeriodMandatory == granitePeriodMaintenancePeriodMandatory &&
    other.jobPeriodTopics == jobPeriodTopics;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (granitePeriodMaintenancePeriodMandatory == null ? 0 : granitePeriodMaintenancePeriodMandatory!.hashCode) +
    (jobPeriodTopics == null ? 0 : jobPeriodTopics!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties[granitePeriodMaintenancePeriodMandatory=$granitePeriodMaintenancePeriodMandatory, jobPeriodTopics=$jobPeriodTopics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.granitePeriodMaintenancePeriodMandatory != null) {
      json[r'granite.maintenance.mandatory'] = this.granitePeriodMaintenancePeriodMandatory;
    } else {
      json[r'granite.maintenance.mandatory'] = null;
    }
    if (this.jobPeriodTopics != null) {
      json[r'job.topics'] = this.jobPeriodTopics;
    } else {
      json[r'job.topics'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(
        granitePeriodMaintenancePeriodMandatory: ConfigNodePropertyBoolean.fromJson(json[r'granite.maintenance.mandatory']),
        jobPeriodTopics: ConfigNodePropertyString.fromJson(json[r'job.topics']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

