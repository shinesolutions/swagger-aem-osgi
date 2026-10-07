//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hapi_impl_h_api_util_impl_properties.g.dart';

/// OrgApacheSlingHapiImplHApiUtilImplProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype] 
/// * [orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype] 
/// * [orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths] 
/// * [orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl] 
/// * [orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled] 
@BuiltValue()
abstract class OrgApacheSlingHapiImplHApiUtilImplProperties implements Built<OrgApacheSlingHapiImplHApiUtilImplProperties, OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.hapi.tools.resourcetype')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype;

  @BuiltValueField(wireName: r'org.apache.sling.hapi.tools.collectionresourcetype')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype;

  @BuiltValueField(wireName: r'org.apache.sling.hapi.tools.searchpaths')
  ConfigNodePropertyArray? get orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths;

  @BuiltValueField(wireName: r'org.apache.sling.hapi.tools.externalurl')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl;

  @BuiltValueField(wireName: r'org.apache.sling.hapi.tools.enabled')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled;

  OrgApacheSlingHapiImplHApiUtilImplProperties._();

  factory OrgApacheSlingHapiImplHApiUtilImplProperties([void updates(OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder b)]) = _$OrgApacheSlingHapiImplHApiUtilImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHapiImplHApiUtilImplProperties> get serializer => _$OrgApacheSlingHapiImplHApiUtilImplPropertiesSerializer();
}

class _$OrgApacheSlingHapiImplHApiUtilImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHapiImplHApiUtilImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHapiImplHApiUtilImplProperties, _$OrgApacheSlingHapiImplHApiUtilImplProperties];

  @override
  final String wireName = r'OrgApacheSlingHapiImplHApiUtilImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHapiImplHApiUtilImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype != null) {
      yield r'org.apache.sling.hapi.tools.resourcetype';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype != null) {
      yield r'org.apache.sling.hapi.tools.collectionresourcetype';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths != null) {
      yield r'org.apache.sling.hapi.tools.searchpaths';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl != null) {
      yield r'org.apache.sling.hapi.tools.externalurl';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled != null) {
      yield r'org.apache.sling.hapi.tools.enabled';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHapiImplHApiUtilImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.hapi.tools.resourcetype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype.replace(valueDes);
          break;
        case r'org.apache.sling.hapi.tools.collectionresourcetype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype.replace(valueDes);
          break;
        case r'org.apache.sling.hapi.tools.searchpaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths.replace(valueDes);
          break;
        case r'org.apache.sling.hapi.tools.externalurl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl.replace(valueDes);
          break;
        case r'org.apache.sling.hapi.tools.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHapiImplHApiUtilImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHapiImplHApiUtilImplPropertiesBuilder();
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

