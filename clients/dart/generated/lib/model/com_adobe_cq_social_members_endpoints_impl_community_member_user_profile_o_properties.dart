//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties {
  /// Returns a new [ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties] instance.
  ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties({
    this.fieldWhitelist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? fieldWhitelist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties &&
    other.fieldWhitelist == fieldWhitelist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fieldWhitelist == null ? 0 : fieldWhitelist!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties[fieldWhitelist=$fieldWhitelist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fieldWhitelist != null) {
      json[r'fieldWhitelist'] = this.fieldWhitelist;
    } else {
      json[r'fieldWhitelist'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties(
        fieldWhitelist: ConfigNodePropertyArray.fromJson(json[r'fieldWhitelist']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

