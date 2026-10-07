//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEventJobsQueueConfigurationProperties {
  /// Returns a new [OrgApacheSlingEventJobsQueueConfigurationProperties] instance.
  OrgApacheSlingEventJobsQueueConfigurationProperties({
    this.queuePeriodName,
    this.queuePeriodTopics,
    this.queuePeriodType,
    this.queuePeriodPriority,
    this.queuePeriodRetries,
    this.queuePeriodRetrydelay,
    this.queuePeriodMaxparallel,
    this.queuePeriodKeepJobs,
    this.queuePeriodPreferRunOnCreationInstance,
    this.queuePeriodThreadPoolSize,
    this.servicePeriodRanking,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? queuePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? queuePeriodTopics;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? queuePeriodType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? queuePeriodPriority;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodRetries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodRetrydelay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyFloat? queuePeriodMaxparallel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? queuePeriodKeepJobs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? queuePeriodPreferRunOnCreationInstance;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodThreadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEventJobsQueueConfigurationProperties &&
    other.queuePeriodName == queuePeriodName &&
    other.queuePeriodTopics == queuePeriodTopics &&
    other.queuePeriodType == queuePeriodType &&
    other.queuePeriodPriority == queuePeriodPriority &&
    other.queuePeriodRetries == queuePeriodRetries &&
    other.queuePeriodRetrydelay == queuePeriodRetrydelay &&
    other.queuePeriodMaxparallel == queuePeriodMaxparallel &&
    other.queuePeriodKeepJobs == queuePeriodKeepJobs &&
    other.queuePeriodPreferRunOnCreationInstance == queuePeriodPreferRunOnCreationInstance &&
    other.queuePeriodThreadPoolSize == queuePeriodThreadPoolSize &&
    other.servicePeriodRanking == servicePeriodRanking;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (queuePeriodName == null ? 0 : queuePeriodName!.hashCode) +
    (queuePeriodTopics == null ? 0 : queuePeriodTopics!.hashCode) +
    (queuePeriodType == null ? 0 : queuePeriodType!.hashCode) +
    (queuePeriodPriority == null ? 0 : queuePeriodPriority!.hashCode) +
    (queuePeriodRetries == null ? 0 : queuePeriodRetries!.hashCode) +
    (queuePeriodRetrydelay == null ? 0 : queuePeriodRetrydelay!.hashCode) +
    (queuePeriodMaxparallel == null ? 0 : queuePeriodMaxparallel!.hashCode) +
    (queuePeriodKeepJobs == null ? 0 : queuePeriodKeepJobs!.hashCode) +
    (queuePeriodPreferRunOnCreationInstance == null ? 0 : queuePeriodPreferRunOnCreationInstance!.hashCode) +
    (queuePeriodThreadPoolSize == null ? 0 : queuePeriodThreadPoolSize!.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEventJobsQueueConfigurationProperties[queuePeriodName=$queuePeriodName, queuePeriodTopics=$queuePeriodTopics, queuePeriodType=$queuePeriodType, queuePeriodPriority=$queuePeriodPriority, queuePeriodRetries=$queuePeriodRetries, queuePeriodRetrydelay=$queuePeriodRetrydelay, queuePeriodMaxparallel=$queuePeriodMaxparallel, queuePeriodKeepJobs=$queuePeriodKeepJobs, queuePeriodPreferRunOnCreationInstance=$queuePeriodPreferRunOnCreationInstance, queuePeriodThreadPoolSize=$queuePeriodThreadPoolSize, servicePeriodRanking=$servicePeriodRanking]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.queuePeriodName != null) {
      json[r'queue.name'] = this.queuePeriodName;
    } else {
      json[r'queue.name'] = null;
    }
    if (this.queuePeriodTopics != null) {
      json[r'queue.topics'] = this.queuePeriodTopics;
    } else {
      json[r'queue.topics'] = null;
    }
    if (this.queuePeriodType != null) {
      json[r'queue.type'] = this.queuePeriodType;
    } else {
      json[r'queue.type'] = null;
    }
    if (this.queuePeriodPriority != null) {
      json[r'queue.priority'] = this.queuePeriodPriority;
    } else {
      json[r'queue.priority'] = null;
    }
    if (this.queuePeriodRetries != null) {
      json[r'queue.retries'] = this.queuePeriodRetries;
    } else {
      json[r'queue.retries'] = null;
    }
    if (this.queuePeriodRetrydelay != null) {
      json[r'queue.retrydelay'] = this.queuePeriodRetrydelay;
    } else {
      json[r'queue.retrydelay'] = null;
    }
    if (this.queuePeriodMaxparallel != null) {
      json[r'queue.maxparallel'] = this.queuePeriodMaxparallel;
    } else {
      json[r'queue.maxparallel'] = null;
    }
    if (this.queuePeriodKeepJobs != null) {
      json[r'queue.keepJobs'] = this.queuePeriodKeepJobs;
    } else {
      json[r'queue.keepJobs'] = null;
    }
    if (this.queuePeriodPreferRunOnCreationInstance != null) {
      json[r'queue.preferRunOnCreationInstance'] = this.queuePeriodPreferRunOnCreationInstance;
    } else {
      json[r'queue.preferRunOnCreationInstance'] = null;
    }
    if (this.queuePeriodThreadPoolSize != null) {
      json[r'queue.threadPoolSize'] = this.queuePeriodThreadPoolSize;
    } else {
      json[r'queue.threadPoolSize'] = null;
    }
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEventJobsQueueConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEventJobsQueueConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEventJobsQueueConfigurationProperties(
        queuePeriodName: ConfigNodePropertyString.fromJson(json[r'queue.name']),
        queuePeriodTopics: ConfigNodePropertyArray.fromJson(json[r'queue.topics']),
        queuePeriodType: ConfigNodePropertyDropDown.fromJson(json[r'queue.type']),
        queuePeriodPriority: ConfigNodePropertyDropDown.fromJson(json[r'queue.priority']),
        queuePeriodRetries: ConfigNodePropertyInteger.fromJson(json[r'queue.retries']),
        queuePeriodRetrydelay: ConfigNodePropertyInteger.fromJson(json[r'queue.retrydelay']),
        queuePeriodMaxparallel: ConfigNodePropertyFloat.fromJson(json[r'queue.maxparallel']),
        queuePeriodKeepJobs: ConfigNodePropertyBoolean.fromJson(json[r'queue.keepJobs']),
        queuePeriodPreferRunOnCreationInstance: ConfigNodePropertyBoolean.fromJson(json[r'queue.preferRunOnCreationInstance']),
        queuePeriodThreadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'queue.threadPoolSize']),
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEventJobsQueueConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEventJobsQueueConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEventJobsQueueConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEventJobsQueueConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEventJobsQueueConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEventJobsQueueConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEventJobsQueueConfigurationProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEventJobsQueueConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEventJobsQueueConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEventJobsQueueConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

