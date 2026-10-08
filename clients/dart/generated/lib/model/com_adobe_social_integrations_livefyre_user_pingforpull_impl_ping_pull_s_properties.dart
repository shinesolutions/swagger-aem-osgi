//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {
  /// Returns a new [ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties] instance.
  ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties({
    this.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties &&
    other.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter == communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter == null ? 0 : communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter!.hashCode);

  @override
  String toString() => 'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties[communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter=$communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter != null) {
      json[r'communities.integration.livefyre.sling.event.filter'] = this.communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter;
    } else {
      json[r'communities.integration.livefyre.sling.event.filter'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(
        communitiesPeriodIntegrationPeriodLivefyrePeriodSlingPeriodEventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'communities.integration.livefyre.sling.event.filter']),
      );
    }
    return null;
  }

  static List<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties-objects as value to a dart map
  static Map<String, List<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

