//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties.g.dart';

/// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
///
/// Properties:
/// * [enabled] 
/// * [configRefResourceNames] 
/// * [configRefPropertyNames] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties implements Built<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'configRefResourceNames')
  ConfigNodePropertyArray? get configRefResourceNames;

  @BuiltValueField(wireName: r'configRefPropertyNames')
  ConfigNodePropertyArray? get configRefPropertyNames;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties._();

  factory OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties([void updates(OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties> get serializer => _$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties, _$OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.configRefResourceNames != null) {
      yield r'configRefResourceNames';
      yield serializers.serialize(
        object.configRefResourceNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.configRefPropertyNames != null) {
      yield r'configRefPropertyNames';
      yield serializers.serialize(
        object.configRefPropertyNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'configRefResourceNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configRefResourceNames.replace(valueDes);
          break;
        case r'configRefPropertyNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configRefPropertyNames.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder();
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

