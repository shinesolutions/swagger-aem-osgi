//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties.g.dart';

/// ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
///
/// Properties:
/// * [name] 
/// * [locale] 
/// * [imsConfig] 
@BuiltValue()
abstract class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties implements Built<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'locale')
  ConfigNodePropertyString? get locale;

  @BuiltValueField(wireName: r'imsConfig')
  ConfigNodePropertyString? get imsConfig;

  ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties._();

  factory ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties([void updates(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder b)]) = _$ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties> get serializer => _$ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesSerializer();
}

class _$ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties, _$ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties];

  @override
  final String wireName = r'ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.locale != null) {
      yield r'locale';
      yield serializers.serialize(
        object.locale,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.imsConfig != null) {
      yield r'imsConfig';
      yield serializers.serialize(
        object.imsConfig,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.locale.replace(valueDes);
          break;
        case r'imsConfig':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.imsConfig.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesBuilder();
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

