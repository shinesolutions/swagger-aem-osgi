//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
  /// Returns a new [OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties] instance.
  OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties({
    this.name,
    this.minPoolSize,
    this.maxPoolSize,
    this.queueSize,
    this.maxThreadAge,
    this.keepAliveTime,
    this.blockPolicy,
    this.shutdownGraceful,
    this.daemon,
    this.shutdownWaitTime,
    this.priority,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minPoolSize;

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
  ConfigNodePropertyInteger? maxThreadAge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? keepAliveTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? blockPolicy;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? shutdownGraceful;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? daemon;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? shutdownWaitTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? priority;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties &&
    other.name == name &&
    other.minPoolSize == minPoolSize &&
    other.maxPoolSize == maxPoolSize &&
    other.queueSize == queueSize &&
    other.maxThreadAge == maxThreadAge &&
    other.keepAliveTime == keepAliveTime &&
    other.blockPolicy == blockPolicy &&
    other.shutdownGraceful == shutdownGraceful &&
    other.daemon == daemon &&
    other.shutdownWaitTime == shutdownWaitTime &&
    other.priority == priority;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (minPoolSize == null ? 0 : minPoolSize!.hashCode) +
    (maxPoolSize == null ? 0 : maxPoolSize!.hashCode) +
    (queueSize == null ? 0 : queueSize!.hashCode) +
    (maxThreadAge == null ? 0 : maxThreadAge!.hashCode) +
    (keepAliveTime == null ? 0 : keepAliveTime!.hashCode) +
    (blockPolicy == null ? 0 : blockPolicy!.hashCode) +
    (shutdownGraceful == null ? 0 : shutdownGraceful!.hashCode) +
    (daemon == null ? 0 : daemon!.hashCode) +
    (shutdownWaitTime == null ? 0 : shutdownWaitTime!.hashCode) +
    (priority == null ? 0 : priority!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties[name=$name, minPoolSize=$minPoolSize, maxPoolSize=$maxPoolSize, queueSize=$queueSize, maxThreadAge=$maxThreadAge, keepAliveTime=$keepAliveTime, blockPolicy=$blockPolicy, shutdownGraceful=$shutdownGraceful, daemon=$daemon, shutdownWaitTime=$shutdownWaitTime, priority=$priority]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.minPoolSize != null) {
      json[r'minPoolSize'] = this.minPoolSize;
    } else {
      json[r'minPoolSize'] = null;
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
    if (this.maxThreadAge != null) {
      json[r'maxThreadAge'] = this.maxThreadAge;
    } else {
      json[r'maxThreadAge'] = null;
    }
    if (this.keepAliveTime != null) {
      json[r'keepAliveTime'] = this.keepAliveTime;
    } else {
      json[r'keepAliveTime'] = null;
    }
    if (this.blockPolicy != null) {
      json[r'blockPolicy'] = this.blockPolicy;
    } else {
      json[r'blockPolicy'] = null;
    }
    if (this.shutdownGraceful != null) {
      json[r'shutdownGraceful'] = this.shutdownGraceful;
    } else {
      json[r'shutdownGraceful'] = null;
    }
    if (this.daemon != null) {
      json[r'daemon'] = this.daemon;
    } else {
      json[r'daemon'] = null;
    }
    if (this.shutdownWaitTime != null) {
      json[r'shutdownWaitTime'] = this.shutdownWaitTime;
    } else {
      json[r'shutdownWaitTime'] = null;
    }
    if (this.priority != null) {
      json[r'priority'] = this.priority;
    } else {
      json[r'priority'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        minPoolSize: ConfigNodePropertyInteger.fromJson(json[r'minPoolSize']),
        maxPoolSize: ConfigNodePropertyInteger.fromJson(json[r'maxPoolSize']),
        queueSize: ConfigNodePropertyInteger.fromJson(json[r'queueSize']),
        maxThreadAge: ConfigNodePropertyInteger.fromJson(json[r'maxThreadAge']),
        keepAliveTime: ConfigNodePropertyInteger.fromJson(json[r'keepAliveTime']),
        blockPolicy: ConfigNodePropertyDropDown.fromJson(json[r'blockPolicy']),
        shutdownGraceful: ConfigNodePropertyBoolean.fromJson(json[r'shutdownGraceful']),
        daemon: ConfigNodePropertyBoolean.fromJson(json[r'daemon']),
        shutdownWaitTime: ConfigNodePropertyInteger.fromJson(json[r'shutdownWaitTime']),
        priority: ConfigNodePropertyDropDown.fromJson(json[r'priority']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

