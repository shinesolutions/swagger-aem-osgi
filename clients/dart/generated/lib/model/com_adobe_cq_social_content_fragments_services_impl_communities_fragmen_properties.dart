//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
  /// Returns a new [ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties] instance.
  ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties({
    this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled,
    this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties &&
    other.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled == cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled &&
    other.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds == cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled == null ? 0 : cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled!.hashCode) +
    (cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds == null ? 0 : cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties[cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled=$cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled, cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds=$cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled != null) {
      json[r'cq.social.content.fragments.services.enabled'] = this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled;
    } else {
      json[r'cq.social.content.fragments.services.enabled'] = null;
    }
    if (this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds != null) {
      json[r'cq.social.content.fragments.services.waitTimeSeconds'] = this.cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds;
    } else {
      json[r'cq.social.content.fragments.services.waitTimeSeconds'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(
        cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.social.content.fragments.services.enabled']),
        cqPeriodSocialPeriodContentPeriodFragmentsPeriodServicesPeriodWaitTimeSeconds: ConfigNodePropertyInteger.fromJson(json[r'cq.social.content.fragments.services.waitTimeSeconds']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

