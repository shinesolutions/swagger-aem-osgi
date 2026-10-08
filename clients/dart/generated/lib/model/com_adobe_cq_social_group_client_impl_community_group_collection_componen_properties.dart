//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
  /// Returns a new [ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties] instance.
  ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties({
    this.groupPeriodListingPeriodPaginationPeriodEnable,
    this.groupPeriodListingPeriodLazyloadingPeriodEnable,
    this.pagePeriodSize,
    this.priority,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? groupPeriodListingPeriodPaginationPeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? groupPeriodListingPeriodLazyloadingPeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? pagePeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priority;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties &&
    other.groupPeriodListingPeriodPaginationPeriodEnable == groupPeriodListingPeriodPaginationPeriodEnable &&
    other.groupPeriodListingPeriodLazyloadingPeriodEnable == groupPeriodListingPeriodLazyloadingPeriodEnable &&
    other.pagePeriodSize == pagePeriodSize &&
    other.priority == priority;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (groupPeriodListingPeriodPaginationPeriodEnable == null ? 0 : groupPeriodListingPeriodPaginationPeriodEnable!.hashCode) +
    (groupPeriodListingPeriodLazyloadingPeriodEnable == null ? 0 : groupPeriodListingPeriodLazyloadingPeriodEnable!.hashCode) +
    (pagePeriodSize == null ? 0 : pagePeriodSize!.hashCode) +
    (priority == null ? 0 : priority!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties[groupPeriodListingPeriodPaginationPeriodEnable=$groupPeriodListingPeriodPaginationPeriodEnable, groupPeriodListingPeriodLazyloadingPeriodEnable=$groupPeriodListingPeriodLazyloadingPeriodEnable, pagePeriodSize=$pagePeriodSize, priority=$priority]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.groupPeriodListingPeriodPaginationPeriodEnable != null) {
      json[r'group.listing.pagination.enable'] = this.groupPeriodListingPeriodPaginationPeriodEnable;
    } else {
      json[r'group.listing.pagination.enable'] = null;
    }
    if (this.groupPeriodListingPeriodLazyloadingPeriodEnable != null) {
      json[r'group.listing.lazyloading.enable'] = this.groupPeriodListingPeriodLazyloadingPeriodEnable;
    } else {
      json[r'group.listing.lazyloading.enable'] = null;
    }
    if (this.pagePeriodSize != null) {
      json[r'page.size'] = this.pagePeriodSize;
    } else {
      json[r'page.size'] = null;
    }
    if (this.priority != null) {
      json[r'priority'] = this.priority;
    } else {
      json[r'priority'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(
        groupPeriodListingPeriodPaginationPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'group.listing.pagination.enable']),
        groupPeriodListingPeriodLazyloadingPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'group.listing.lazyloading.enable']),
        pagePeriodSize: ConfigNodePropertyInteger.fromJson(json[r'page.size']),
        priority: ConfigNodePropertyInteger.fromJson(json[r'priority']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

