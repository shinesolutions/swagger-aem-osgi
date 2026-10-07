//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_core_impl_script_cache_impl_properties.g.dart';

/// OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize] 
/// * [orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions] 
@BuiltValue()
abstract class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties implements Built<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties, OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.scripting.cache.size')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize;

  @BuiltValueField(wireName: r'org.apache.sling.scripting.cache.additional_extensions')
  ConfigNodePropertyArray? get orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions;

  OrgApacheSlingScriptingCoreImplScriptCacheImplProperties._();

  factory OrgApacheSlingScriptingCoreImplScriptCacheImplProperties([void updates(OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder b)]) = _$OrgApacheSlingScriptingCoreImplScriptCacheImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties> get serializer => _$OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesSerializer();
}

class _$OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingCoreImplScriptCacheImplProperties, _$OrgApacheSlingScriptingCoreImplScriptCacheImplProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingCoreImplScriptCacheImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize != null) {
      yield r'org.apache.sling.scripting.cache.size';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions != null) {
      yield r'org.apache.sling.scripting.cache.additional_extensions';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.scripting.cache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize.replace(valueDes);
          break;
        case r'org.apache.sling.scripting.cache.additional_extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingCoreImplScriptCacheImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingCoreImplScriptCacheImplPropertiesBuilder();
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

