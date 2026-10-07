//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties {
  /// Returns a new [ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties] instance.
  ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties({
    this.endpointUri,
    this.connectionTimeout,
    this.socketTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? endpointUri;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? connectionTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? socketTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties &&
    other.endpointUri == endpointUri &&
    other.connectionTimeout == connectionTimeout &&
    other.socketTimeout == socketTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (endpointUri == null ? 0 : endpointUri!.hashCode) +
    (connectionTimeout == null ? 0 : connectionTimeout!.hashCode) +
    (socketTimeout == null ? 0 : socketTimeout!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties[endpointUri=$endpointUri, connectionTimeout=$connectionTimeout, socketTimeout=$socketTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.endpointUri != null) {
      json[r'endpointUri'] = this.endpointUri;
    } else {
      json[r'endpointUri'] = null;
    }
    if (this.connectionTimeout != null) {
      json[r'connectionTimeout'] = this.connectionTimeout;
    } else {
      json[r'connectionTimeout'] = null;
    }
    if (this.socketTimeout != null) {
      json[r'socketTimeout'] = this.socketTimeout;
    } else {
      json[r'socketTimeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(
        endpointUri: ConfigNodePropertyString.fromJson(json[r'endpointUri']),
        connectionTimeout: ConfigNodePropertyInteger.fromJson(json[r'connectionTimeout']),
        socketTimeout: ConfigNodePropertyInteger.fromJson(json[r'socketTimeout']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

