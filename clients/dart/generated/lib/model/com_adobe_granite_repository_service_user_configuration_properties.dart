//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
  /// Returns a new [ComAdobeGraniteRepositoryServiceUserConfigurationProperties] instance.
  ComAdobeGraniteRepositoryServiceUserConfigurationProperties({
    this.servicePeriodRanking,
    this.serviceusersPeriodSimpleSubjectPopulation,
    this.serviceusersPeriodList,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? serviceusersPeriodSimpleSubjectPopulation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? serviceusersPeriodList;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRepositoryServiceUserConfigurationProperties &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.serviceusersPeriodSimpleSubjectPopulation == serviceusersPeriodSimpleSubjectPopulation &&
    other.serviceusersPeriodList == serviceusersPeriodList;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (serviceusersPeriodSimpleSubjectPopulation == null ? 0 : serviceusersPeriodSimpleSubjectPopulation!.hashCode) +
    (serviceusersPeriodList == null ? 0 : serviceusersPeriodList!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRepositoryServiceUserConfigurationProperties[servicePeriodRanking=$servicePeriodRanking, serviceusersPeriodSimpleSubjectPopulation=$serviceusersPeriodSimpleSubjectPopulation, serviceusersPeriodList=$serviceusersPeriodList]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.serviceusersPeriodSimpleSubjectPopulation != null) {
      json[r'serviceusers.simpleSubjectPopulation'] = this.serviceusersPeriodSimpleSubjectPopulation;
    } else {
      json[r'serviceusers.simpleSubjectPopulation'] = null;
    }
    if (this.serviceusersPeriodList != null) {
      json[r'serviceusers.list'] = this.serviceusersPeriodList;
    } else {
      json[r'serviceusers.list'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRepositoryServiceUserConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRepositoryServiceUserConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        serviceusersPeriodSimpleSubjectPopulation: ConfigNodePropertyBoolean.fromJson(json[r'serviceusers.simpleSubjectPopulation']),
        serviceusersPeriodList: ConfigNodePropertyArray.fromJson(json[r'serviceusers.list']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRepositoryServiceUserConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRepositoryServiceUserConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRepositoryServiceUserConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRepositoryServiceUserConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRepositoryServiceUserConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRepositoryServiceUserConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRepositoryServiceUserConfigurationProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRepositoryServiceUserConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRepositoryServiceUserConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRepositoryServiceUserConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

