//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReplicationImplAgentManagerImplProperties {
  /// Returns a new [ComDayCqReplicationImplAgentManagerImplProperties] instance.
  ComDayCqReplicationImplAgentManagerImplProperties({
    this.jobPeriodTopics,
    this.serviceUserPeriodTarget,
    this.agentProviderPeriodTarget,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jobPeriodTopics;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceUserPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? agentProviderPeriodTarget;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReplicationImplAgentManagerImplProperties &&
    other.jobPeriodTopics == jobPeriodTopics &&
    other.serviceUserPeriodTarget == serviceUserPeriodTarget &&
    other.agentProviderPeriodTarget == agentProviderPeriodTarget;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jobPeriodTopics == null ? 0 : jobPeriodTopics!.hashCode) +
    (serviceUserPeriodTarget == null ? 0 : serviceUserPeriodTarget!.hashCode) +
    (agentProviderPeriodTarget == null ? 0 : agentProviderPeriodTarget!.hashCode);

  @override
  String toString() => 'ComDayCqReplicationImplAgentManagerImplProperties[jobPeriodTopics=$jobPeriodTopics, serviceUserPeriodTarget=$serviceUserPeriodTarget, agentProviderPeriodTarget=$agentProviderPeriodTarget]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jobPeriodTopics != null) {
      json[r'job.topics'] = this.jobPeriodTopics;
    } else {
      json[r'job.topics'] = null;
    }
    if (this.serviceUserPeriodTarget != null) {
      json[r'serviceUser.target'] = this.serviceUserPeriodTarget;
    } else {
      json[r'serviceUser.target'] = null;
    }
    if (this.agentProviderPeriodTarget != null) {
      json[r'agentProvider.target'] = this.agentProviderPeriodTarget;
    } else {
      json[r'agentProvider.target'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReplicationImplAgentManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReplicationImplAgentManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReplicationImplAgentManagerImplProperties(
        jobPeriodTopics: ConfigNodePropertyString.fromJson(json[r'job.topics']),
        serviceUserPeriodTarget: ConfigNodePropertyString.fromJson(json[r'serviceUser.target']),
        agentProviderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'agentProvider.target']),
      );
    }
    return null;
  }

  static List<ComDayCqReplicationImplAgentManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReplicationImplAgentManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReplicationImplAgentManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReplicationImplAgentManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReplicationImplAgentManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReplicationImplAgentManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReplicationImplAgentManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReplicationImplAgentManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReplicationImplAgentManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReplicationImplAgentManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

