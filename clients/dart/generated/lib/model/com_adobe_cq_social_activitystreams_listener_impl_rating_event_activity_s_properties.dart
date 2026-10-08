//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {
  /// Returns a new [ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties] instance.
  ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties({
    this.ranking,
    this.enable,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? ranking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enable;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties &&
    other.ranking == ranking &&
    other.enable == enable;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ranking == null ? 0 : ranking!.hashCode) +
    (enable == null ? 0 : enable!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties[ranking=$ranking, enable=$enable]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ranking != null) {
      json[r'ranking'] = this.ranking;
    } else {
      json[r'ranking'] = null;
    }
    if (this.enable != null) {
      json[r'enable'] = this.enable;
    } else {
      json[r'enable'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(
        ranking: ConfigNodePropertyInteger.fromJson(json[r'ranking']),
        enable: ConfigNodePropertyBoolean.fromJson(json[r'enable']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

