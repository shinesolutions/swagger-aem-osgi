//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties] instance.
  ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties({
    this.threadPoolSize,
    this.delayTime,
    this.workerSleepTime,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? threadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? delayTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? workerSleepTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties &&
    other.threadPoolSize == threadPoolSize &&
    other.delayTime == delayTime &&
    other.workerSleepTime == workerSleepTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (threadPoolSize == null ? 0 : threadPoolSize!.hashCode) +
    (delayTime == null ? 0 : delayTime!.hashCode) +
    (workerSleepTime == null ? 0 : workerSleepTime!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties[threadPoolSize=$threadPoolSize, delayTime=$delayTime, workerSleepTime=$workerSleepTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.threadPoolSize != null) {
      json[r'threadPoolSize'] = this.threadPoolSize;
    } else {
      json[r'threadPoolSize'] = null;
    }
    if (this.delayTime != null) {
      json[r'delayTime'] = this.delayTime;
    } else {
      json[r'delayTime'] = null;
    }
    if (this.workerSleepTime != null) {
      json[r'workerSleepTime'] = this.workerSleepTime;
    } else {
      json[r'workerSleepTime'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(
        threadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'threadPoolSize']),
        delayTime: ConfigNodePropertyInteger.fromJson(json[r'delayTime']),
        workerSleepTime: ConfigNodePropertyInteger.fromJson(json[r'workerSleepTime']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

