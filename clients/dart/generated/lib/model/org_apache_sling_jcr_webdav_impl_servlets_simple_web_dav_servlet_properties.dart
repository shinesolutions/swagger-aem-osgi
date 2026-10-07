//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
  /// Returns a new [OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties] instance.
  OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties({
    this.davPeriodRoot,
    this.davPeriodCreateAbsoluteUri,
    this.davPeriodRealm,
    this.collectionPeriodTypes,
    this.filterPeriodPrefixes,
    this.filterPeriodTypes,
    this.filterPeriodUris,
    this.typePeriodCollections,
    this.typePeriodNoncollections,
    this.typePeriodContent,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? davPeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? davPeriodCreateAbsoluteUri;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? davPeriodRealm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? collectionPeriodTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodPrefixes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? filterPeriodTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? filterPeriodUris;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? typePeriodCollections;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? typePeriodNoncollections;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? typePeriodContent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties &&
    other.davPeriodRoot == davPeriodRoot &&
    other.davPeriodCreateAbsoluteUri == davPeriodCreateAbsoluteUri &&
    other.davPeriodRealm == davPeriodRealm &&
    other.collectionPeriodTypes == collectionPeriodTypes &&
    other.filterPeriodPrefixes == filterPeriodPrefixes &&
    other.filterPeriodTypes == filterPeriodTypes &&
    other.filterPeriodUris == filterPeriodUris &&
    other.typePeriodCollections == typePeriodCollections &&
    other.typePeriodNoncollections == typePeriodNoncollections &&
    other.typePeriodContent == typePeriodContent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (davPeriodRoot == null ? 0 : davPeriodRoot!.hashCode) +
    (davPeriodCreateAbsoluteUri == null ? 0 : davPeriodCreateAbsoluteUri!.hashCode) +
    (davPeriodRealm == null ? 0 : davPeriodRealm!.hashCode) +
    (collectionPeriodTypes == null ? 0 : collectionPeriodTypes!.hashCode) +
    (filterPeriodPrefixes == null ? 0 : filterPeriodPrefixes!.hashCode) +
    (filterPeriodTypes == null ? 0 : filterPeriodTypes!.hashCode) +
    (filterPeriodUris == null ? 0 : filterPeriodUris!.hashCode) +
    (typePeriodCollections == null ? 0 : typePeriodCollections!.hashCode) +
    (typePeriodNoncollections == null ? 0 : typePeriodNoncollections!.hashCode) +
    (typePeriodContent == null ? 0 : typePeriodContent!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties[davPeriodRoot=$davPeriodRoot, davPeriodCreateAbsoluteUri=$davPeriodCreateAbsoluteUri, davPeriodRealm=$davPeriodRealm, collectionPeriodTypes=$collectionPeriodTypes, filterPeriodPrefixes=$filterPeriodPrefixes, filterPeriodTypes=$filterPeriodTypes, filterPeriodUris=$filterPeriodUris, typePeriodCollections=$typePeriodCollections, typePeriodNoncollections=$typePeriodNoncollections, typePeriodContent=$typePeriodContent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.davPeriodRoot != null) {
      json[r'dav.root'] = this.davPeriodRoot;
    } else {
      json[r'dav.root'] = null;
    }
    if (this.davPeriodCreateAbsoluteUri != null) {
      json[r'dav.create-absolute-uri'] = this.davPeriodCreateAbsoluteUri;
    } else {
      json[r'dav.create-absolute-uri'] = null;
    }
    if (this.davPeriodRealm != null) {
      json[r'dav.realm'] = this.davPeriodRealm;
    } else {
      json[r'dav.realm'] = null;
    }
    if (this.collectionPeriodTypes != null) {
      json[r'collection.types'] = this.collectionPeriodTypes;
    } else {
      json[r'collection.types'] = null;
    }
    if (this.filterPeriodPrefixes != null) {
      json[r'filter.prefixes'] = this.filterPeriodPrefixes;
    } else {
      json[r'filter.prefixes'] = null;
    }
    if (this.filterPeriodTypes != null) {
      json[r'filter.types'] = this.filterPeriodTypes;
    } else {
      json[r'filter.types'] = null;
    }
    if (this.filterPeriodUris != null) {
      json[r'filter.uris'] = this.filterPeriodUris;
    } else {
      json[r'filter.uris'] = null;
    }
    if (this.typePeriodCollections != null) {
      json[r'type.collections'] = this.typePeriodCollections;
    } else {
      json[r'type.collections'] = null;
    }
    if (this.typePeriodNoncollections != null) {
      json[r'type.noncollections'] = this.typePeriodNoncollections;
    } else {
      json[r'type.noncollections'] = null;
    }
    if (this.typePeriodContent != null) {
      json[r'type.content'] = this.typePeriodContent;
    } else {
      json[r'type.content'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
        davPeriodRoot: ConfigNodePropertyString.fromJson(json[r'dav.root']),
        davPeriodCreateAbsoluteUri: ConfigNodePropertyBoolean.fromJson(json[r'dav.create-absolute-uri']),
        davPeriodRealm: ConfigNodePropertyString.fromJson(json[r'dav.realm']),
        collectionPeriodTypes: ConfigNodePropertyArray.fromJson(json[r'collection.types']),
        filterPeriodPrefixes: ConfigNodePropertyArray.fromJson(json[r'filter.prefixes']),
        filterPeriodTypes: ConfigNodePropertyString.fromJson(json[r'filter.types']),
        filterPeriodUris: ConfigNodePropertyString.fromJson(json[r'filter.uris']),
        typePeriodCollections: ConfigNodePropertyString.fromJson(json[r'type.collections']),
        typePeriodNoncollections: ConfigNodePropertyString.fromJson(json[r'type.noncollections']),
        typePeriodContent: ConfigNodePropertyString.fromJson(json[r'type.content']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

