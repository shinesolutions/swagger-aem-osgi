//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {
  /// Returns a new [ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties] instance.
  ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties({
    this.streamPath,
    this.streamName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? streamPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? streamName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties &&
    other.streamPath == streamPath &&
    other.streamName == streamName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (streamPath == null ? 0 : streamPath!.hashCode) +
    (streamName == null ? 0 : streamName!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties[streamPath=$streamPath, streamName=$streamName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.streamPath != null) {
      json[r'streamPath'] = this.streamPath;
    } else {
      json[r'streamPath'] = null;
    }
    if (this.streamName != null) {
      json[r'streamName'] = this.streamName;
    } else {
      json[r'streamName'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(
        streamPath: ConfigNodePropertyString.fromJson(json[r'streamPath']),
        streamName: ConfigNodePropertyString.fromJson(json[r'streamName']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

