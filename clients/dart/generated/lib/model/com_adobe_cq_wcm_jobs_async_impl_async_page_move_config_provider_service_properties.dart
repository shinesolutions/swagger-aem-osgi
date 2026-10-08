//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {
  /// Returns a new [ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties] instance.
  ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties({
    this.threshold,
    this.jobTopicName,
    this.emailEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? threshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jobTopicName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? emailEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties &&
    other.threshold == threshold &&
    other.jobTopicName == jobTopicName &&
    other.emailEnabled == emailEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (threshold == null ? 0 : threshold!.hashCode) +
    (jobTopicName == null ? 0 : jobTopicName!.hashCode) +
    (emailEnabled == null ? 0 : emailEnabled!.hashCode);

  @override
  String toString() => 'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties[threshold=$threshold, jobTopicName=$jobTopicName, emailEnabled=$emailEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.threshold != null) {
      json[r'threshold'] = this.threshold;
    } else {
      json[r'threshold'] = null;
    }
    if (this.jobTopicName != null) {
      json[r'jobTopicName'] = this.jobTopicName;
    } else {
      json[r'jobTopicName'] = null;
    }
    if (this.emailEnabled != null) {
      json[r'emailEnabled'] = this.emailEnabled;
    } else {
      json[r'emailEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(
        threshold: ConfigNodePropertyInteger.fromJson(json[r'threshold']),
        jobTopicName: ConfigNodePropertyString.fromJson(json[r'jobTopicName']),
        emailEnabled: ConfigNodePropertyBoolean.fromJson(json[r'emailEnabled']),
      );
    }
    return null;
  }

  static List<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

