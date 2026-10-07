//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEventImplJobsJobConsumerManagerProperties {
  /// Returns a new [OrgApacheSlingEventImplJobsJobConsumerManagerProperties] instance.
  OrgApacheSlingEventImplJobsJobConsumerManagerProperties({
    this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist,
    this.jobPeriodConsumermanagerPeriodWhitelist,
    this.jobPeriodConsumermanagerPeriodBlacklist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? jobPeriodConsumermanagerPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? jobPeriodConsumermanagerPeriodBlacklist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEventImplJobsJobConsumerManagerProperties &&
    other.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist == orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist &&
    other.jobPeriodConsumermanagerPeriodWhitelist == jobPeriodConsumermanagerPeriodWhitelist &&
    other.jobPeriodConsumermanagerPeriodBlacklist == jobPeriodConsumermanagerPeriodBlacklist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist == null ? 0 : orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist!.hashCode) +
    (jobPeriodConsumermanagerPeriodWhitelist == null ? 0 : jobPeriodConsumermanagerPeriodWhitelist!.hashCode) +
    (jobPeriodConsumermanagerPeriodBlacklist == null ? 0 : jobPeriodConsumermanagerPeriodBlacklist!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEventImplJobsJobConsumerManagerProperties[orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist=$orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist, jobPeriodConsumermanagerPeriodWhitelist=$jobPeriodConsumermanagerPeriodWhitelist, jobPeriodConsumermanagerPeriodBlacklist=$jobPeriodConsumermanagerPeriodBlacklist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist != null) {
      json[r'org.apache.sling.installer.configuration.persist'] = this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;
    } else {
      json[r'org.apache.sling.installer.configuration.persist'] = null;
    }
    if (this.jobPeriodConsumermanagerPeriodWhitelist != null) {
      json[r'job.consumermanager.whitelist'] = this.jobPeriodConsumermanagerPeriodWhitelist;
    } else {
      json[r'job.consumermanager.whitelist'] = null;
    }
    if (this.jobPeriodConsumermanagerPeriodBlacklist != null) {
      json[r'job.consumermanager.blacklist'] = this.jobPeriodConsumermanagerPeriodBlacklist;
    } else {
      json[r'job.consumermanager.blacklist'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEventImplJobsJobConsumerManagerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEventImplJobsJobConsumerManagerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEventImplJobsJobConsumerManagerProperties(
        orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist: ConfigNodePropertyBoolean.fromJson(json[r'org.apache.sling.installer.configuration.persist']),
        jobPeriodConsumermanagerPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'job.consumermanager.whitelist']),
        jobPeriodConsumermanagerPeriodBlacklist: ConfigNodePropertyArray.fromJson(json[r'job.consumermanager.blacklist']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEventImplJobsJobConsumerManagerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEventImplJobsJobConsumerManagerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEventImplJobsJobConsumerManagerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEventImplJobsJobConsumerManagerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEventImplJobsJobConsumerManagerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEventImplJobsJobConsumerManagerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEventImplJobsJobConsumerManagerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEventImplJobsJobConsumerManagerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEventImplJobsJobConsumerManagerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEventImplJobsJobConsumerManagerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

