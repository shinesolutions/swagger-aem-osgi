//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuration_properties.g.dart';

/// ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
///
/// Properties:
/// * [isEnabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties implements Built<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'isEnabled')
  ConfigNodePropertyBoolean? get isEnabled;

  ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties._();

  factory ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties([void updates(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder b)]) = _$ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties> get serializer => _$ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesSerializer();
}

class _$ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties, _$ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isEnabled != null) {
      yield r'isEnabled';
      yield serializers.serialize(
        object.isEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesBuilder();
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

