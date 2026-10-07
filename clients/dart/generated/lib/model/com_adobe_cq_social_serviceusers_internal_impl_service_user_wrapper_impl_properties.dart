//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {
  /// Returns a new [ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties] instance.
  ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties({
    this.enableFallback,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableFallback;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties &&
    other.enableFallback == enableFallback;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enableFallback == null ? 0 : enableFallback!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties[enableFallback=$enableFallback]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enableFallback != null) {
      json[r'enableFallback'] = this.enableFallback;
    } else {
      json[r'enableFallback'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(
        enableFallback: ConfigNodePropertyBoolean.fromJson(json[r'enableFallback']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

