//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_asset_download_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletAssetDownloadServletProperties
///
/// Properties:
/// * [enabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletAssetDownloadServletProperties implements Built<ComDayCqDamCoreImplServletAssetDownloadServletProperties, ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  ComDayCqDamCoreImplServletAssetDownloadServletProperties._();

  factory ComDayCqDamCoreImplServletAssetDownloadServletProperties([void updates(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletAssetDownloadServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletAssetDownloadServletProperties> get serializer => _$ComDayCqDamCoreImplServletAssetDownloadServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletAssetDownloadServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletAssetDownloadServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletAssetDownloadServletProperties, _$ComDayCqDamCoreImplServletAssetDownloadServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletAssetDownloadServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetDownloadServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletAssetDownloadServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletAssetDownloadServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletAssetDownloadServletPropertiesBuilder();
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

