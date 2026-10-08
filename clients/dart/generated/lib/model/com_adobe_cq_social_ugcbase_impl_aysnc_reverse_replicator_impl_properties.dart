//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties] instance.
  ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties({
    this.poolSize,
    this.maxPoolSize,
    this.queueSize,
    this.keepAliveTime,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? poolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queueSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? keepAliveTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties &&
    other.poolSize == poolSize &&
    other.maxPoolSize == maxPoolSize &&
    other.queueSize == queueSize &&
    other.keepAliveTime == keepAliveTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (poolSize == null ? 0 : poolSize!.hashCode) +
    (maxPoolSize == null ? 0 : maxPoolSize!.hashCode) +
    (queueSize == null ? 0 : queueSize!.hashCode) +
    (keepAliveTime == null ? 0 : keepAliveTime!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties[poolSize=$poolSize, maxPoolSize=$maxPoolSize, queueSize=$queueSize, keepAliveTime=$keepAliveTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.poolSize != null) {
      json[r'poolSize'] = this.poolSize;
    } else {
      json[r'poolSize'] = null;
    }
    if (this.maxPoolSize != null) {
      json[r'maxPoolSize'] = this.maxPoolSize;
    } else {
      json[r'maxPoolSize'] = null;
    }
    if (this.queueSize != null) {
      json[r'queueSize'] = this.queueSize;
    } else {
      json[r'queueSize'] = null;
    }
    if (this.keepAliveTime != null) {
      json[r'keepAliveTime'] = this.keepAliveTime;
    } else {
      json[r'keepAliveTime'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
        poolSize: ConfigNodePropertyInteger.fromJson(json[r'poolSize']),
        maxPoolSize: ConfigNodePropertyInteger.fromJson(json[r'maxPoolSize']),
        queueSize: ConfigNodePropertyInteger.fromJson(json[r'queueSize']),
        keepAliveTime: ConfigNodePropertyInteger.fromJson(json[r'keepAliveTime']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

