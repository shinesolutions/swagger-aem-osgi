//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
  /// Returns a new [ComAdobeCqDamS7imagingImplIsImageServerComponentProperties] instance.
  ComAdobeCqDamS7imagingImplIsImageServerComponentProperties({
    this.tcpPort,
    this.allowRemoteAccess,
    this.maxRenderRgnPixels,
    this.maxMessageSize,
    this.randomAccessUrlTimeout,
    this.workerThreads,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tcpPort;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? allowRemoteAccess;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? maxRenderRgnPixels;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? maxMessageSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? randomAccessUrlTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? workerThreads;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamS7imagingImplIsImageServerComponentProperties &&
    other.tcpPort == tcpPort &&
    other.allowRemoteAccess == allowRemoteAccess &&
    other.maxRenderRgnPixels == maxRenderRgnPixels &&
    other.maxMessageSize == maxMessageSize &&
    other.randomAccessUrlTimeout == randomAccessUrlTimeout &&
    other.workerThreads == workerThreads;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (tcpPort == null ? 0 : tcpPort!.hashCode) +
    (allowRemoteAccess == null ? 0 : allowRemoteAccess!.hashCode) +
    (maxRenderRgnPixels == null ? 0 : maxRenderRgnPixels!.hashCode) +
    (maxMessageSize == null ? 0 : maxMessageSize!.hashCode) +
    (randomAccessUrlTimeout == null ? 0 : randomAccessUrlTimeout!.hashCode) +
    (workerThreads == null ? 0 : workerThreads!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamS7imagingImplIsImageServerComponentProperties[tcpPort=$tcpPort, allowRemoteAccess=$allowRemoteAccess, maxRenderRgnPixels=$maxRenderRgnPixels, maxMessageSize=$maxMessageSize, randomAccessUrlTimeout=$randomAccessUrlTimeout, workerThreads=$workerThreads]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.tcpPort != null) {
      json[r'TcpPort'] = this.tcpPort;
    } else {
      json[r'TcpPort'] = null;
    }
    if (this.allowRemoteAccess != null) {
      json[r'AllowRemoteAccess'] = this.allowRemoteAccess;
    } else {
      json[r'AllowRemoteAccess'] = null;
    }
    if (this.maxRenderRgnPixels != null) {
      json[r'MaxRenderRgnPixels'] = this.maxRenderRgnPixels;
    } else {
      json[r'MaxRenderRgnPixels'] = null;
    }
    if (this.maxMessageSize != null) {
      json[r'MaxMessageSize'] = this.maxMessageSize;
    } else {
      json[r'MaxMessageSize'] = null;
    }
    if (this.randomAccessUrlTimeout != null) {
      json[r'RandomAccessUrlTimeout'] = this.randomAccessUrlTimeout;
    } else {
      json[r'RandomAccessUrlTimeout'] = null;
    }
    if (this.workerThreads != null) {
      json[r'WorkerThreads'] = this.workerThreads;
    } else {
      json[r'WorkerThreads'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamS7imagingImplIsImageServerComponentProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamS7imagingImplIsImageServerComponentProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
        tcpPort: ConfigNodePropertyString.fromJson(json[r'TcpPort']),
        allowRemoteAccess: ConfigNodePropertyBoolean.fromJson(json[r'AllowRemoteAccess']),
        maxRenderRgnPixels: ConfigNodePropertyString.fromJson(json[r'MaxRenderRgnPixels']),
        maxMessageSize: ConfigNodePropertyString.fromJson(json[r'MaxMessageSize']),
        randomAccessUrlTimeout: ConfigNodePropertyInteger.fromJson(json[r'RandomAccessUrlTimeout']),
        workerThreads: ConfigNodePropertyInteger.fromJson(json[r'WorkerThreads']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamS7imagingImplIsImageServerComponentProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

