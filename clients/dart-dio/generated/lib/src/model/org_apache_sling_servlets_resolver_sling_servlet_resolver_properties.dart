//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_servlets_resolver_sling_servlet_resolver_properties.g.dart';

/// OrgApacheSlingServletsResolverSlingServletResolverProperties
///
/// Properties:
/// * [servletresolverPeriodServletRoot] 
/// * [servletresolverPeriodCacheSize] 
/// * [servletresolverPeriodPaths] 
/// * [servletresolverPeriodDefaultExtensions] 
@BuiltValue()
abstract class OrgApacheSlingServletsResolverSlingServletResolverProperties implements Built<OrgApacheSlingServletsResolverSlingServletResolverProperties, OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder> {
  @BuiltValueField(wireName: r'servletresolver.servletRoot')
  ConfigNodePropertyString? get servletresolverPeriodServletRoot;

  @BuiltValueField(wireName: r'servletresolver.cacheSize')
  ConfigNodePropertyInteger? get servletresolverPeriodCacheSize;

  @BuiltValueField(wireName: r'servletresolver.paths')
  ConfigNodePropertyArray? get servletresolverPeriodPaths;

  @BuiltValueField(wireName: r'servletresolver.defaultExtensions')
  ConfigNodePropertyArray? get servletresolverPeriodDefaultExtensions;

  OrgApacheSlingServletsResolverSlingServletResolverProperties._();

  factory OrgApacheSlingServletsResolverSlingServletResolverProperties([void updates(OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder b)]) = _$OrgApacheSlingServletsResolverSlingServletResolverProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServletsResolverSlingServletResolverProperties> get serializer => _$OrgApacheSlingServletsResolverSlingServletResolverPropertiesSerializer();
}

class _$OrgApacheSlingServletsResolverSlingServletResolverPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServletsResolverSlingServletResolverProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServletsResolverSlingServletResolverProperties, _$OrgApacheSlingServletsResolverSlingServletResolverProperties];

  @override
  final String wireName = r'OrgApacheSlingServletsResolverSlingServletResolverProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServletsResolverSlingServletResolverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servletresolverPeriodServletRoot != null) {
      yield r'servletresolver.servletRoot';
      yield serializers.serialize(
        object.servletresolverPeriodServletRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.servletresolverPeriodCacheSize != null) {
      yield r'servletresolver.cacheSize';
      yield serializers.serialize(
        object.servletresolverPeriodCacheSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.servletresolverPeriodPaths != null) {
      yield r'servletresolver.paths';
      yield serializers.serialize(
        object.servletresolverPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servletresolverPeriodDefaultExtensions != null) {
      yield r'servletresolver.defaultExtensions';
      yield serializers.serialize(
        object.servletresolverPeriodDefaultExtensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServletsResolverSlingServletResolverProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'servletresolver.servletRoot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.servletresolverPeriodServletRoot.replace(valueDes);
          break;
        case r'servletresolver.cacheSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servletresolverPeriodCacheSize.replace(valueDes);
          break;
        case r'servletresolver.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servletresolverPeriodPaths.replace(valueDes);
          break;
        case r'servletresolver.defaultExtensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.servletresolverPeriodDefaultExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServletsResolverSlingServletResolverProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder();
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

