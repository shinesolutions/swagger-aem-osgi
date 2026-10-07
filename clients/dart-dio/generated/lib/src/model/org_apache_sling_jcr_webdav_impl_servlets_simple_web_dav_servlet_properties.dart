//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties.g.dart';

/// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties
///
/// Properties:
/// * [davPeriodRoot] 
/// * [davPeriodCreateAbsoluteUri] 
/// * [davPeriodRealm] 
/// * [collectionPeriodTypes] 
/// * [filterPeriodPrefixes] 
/// * [filterPeriodTypes] 
/// * [filterPeriodUris] 
/// * [typePeriodCollections] 
/// * [typePeriodNoncollections] 
/// * [typePeriodContent] 
@BuiltValue()
abstract class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties implements Built<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'dav.root')
  ConfigNodePropertyString? get davPeriodRoot;

  @BuiltValueField(wireName: r'dav.create-absolute-uri')
  ConfigNodePropertyBoolean? get davPeriodCreateAbsoluteUri;

  @BuiltValueField(wireName: r'dav.realm')
  ConfigNodePropertyString? get davPeriodRealm;

  @BuiltValueField(wireName: r'collection.types')
  ConfigNodePropertyArray? get collectionPeriodTypes;

  @BuiltValueField(wireName: r'filter.prefixes')
  ConfigNodePropertyArray? get filterPeriodPrefixes;

  @BuiltValueField(wireName: r'filter.types')
  ConfigNodePropertyString? get filterPeriodTypes;

  @BuiltValueField(wireName: r'filter.uris')
  ConfigNodePropertyString? get filterPeriodUris;

  @BuiltValueField(wireName: r'type.collections')
  ConfigNodePropertyString? get typePeriodCollections;

  @BuiltValueField(wireName: r'type.noncollections')
  ConfigNodePropertyString? get typePeriodNoncollections;

  @BuiltValueField(wireName: r'type.content')
  ConfigNodePropertyString? get typePeriodContent;

  OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties._();

  factory OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties([void updates(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder b)]) = _$OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties> get serializer => _$OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesSerializer();
}

class _$OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties, _$OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.davPeriodRoot != null) {
      yield r'dav.root';
      yield serializers.serialize(
        object.davPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.davPeriodCreateAbsoluteUri != null) {
      yield r'dav.create-absolute-uri';
      yield serializers.serialize(
        object.davPeriodCreateAbsoluteUri,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.davPeriodRealm != null) {
      yield r'dav.realm';
      yield serializers.serialize(
        object.davPeriodRealm,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.collectionPeriodTypes != null) {
      yield r'collection.types';
      yield serializers.serialize(
        object.collectionPeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodPrefixes != null) {
      yield r'filter.prefixes';
      yield serializers.serialize(
        object.filterPeriodPrefixes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodTypes != null) {
      yield r'filter.types';
      yield serializers.serialize(
        object.filterPeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.filterPeriodUris != null) {
      yield r'filter.uris';
      yield serializers.serialize(
        object.filterPeriodUris,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.typePeriodCollections != null) {
      yield r'type.collections';
      yield serializers.serialize(
        object.typePeriodCollections,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.typePeriodNoncollections != null) {
      yield r'type.noncollections';
      yield serializers.serialize(
        object.typePeriodNoncollections,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.typePeriodContent != null) {
      yield r'type.content';
      yield serializers.serialize(
        object.typePeriodContent,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dav.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.davPeriodRoot.replace(valueDes);
          break;
        case r'dav.create-absolute-uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.davPeriodCreateAbsoluteUri.replace(valueDes);
          break;
        case r'dav.realm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.davPeriodRealm.replace(valueDes);
          break;
        case r'collection.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.collectionPeriodTypes.replace(valueDes);
          break;
        case r'filter.prefixes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodPrefixes.replace(valueDes);
          break;
        case r'filter.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filterPeriodTypes.replace(valueDes);
          break;
        case r'filter.uris':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filterPeriodUris.replace(valueDes);
          break;
        case r'type.collections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodCollections.replace(valueDes);
          break;
        case r'type.noncollections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodNoncollections.replace(valueDes);
          break;
        case r'type.content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.typePeriodContent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

