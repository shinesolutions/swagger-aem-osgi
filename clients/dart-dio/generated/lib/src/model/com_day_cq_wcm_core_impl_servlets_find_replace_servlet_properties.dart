//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties.g.dart';

/// ComDayCqWcmCoreImplServletsFindReplaceServletProperties
///
/// Properties:
/// * [scope] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsFindReplaceServletProperties implements Built<ComDayCqWcmCoreImplServletsFindReplaceServletProperties, ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'scope')
  ConfigNodePropertyArray? get scope;

  ComDayCqWcmCoreImplServletsFindReplaceServletProperties._();

  factory ComDayCqWcmCoreImplServletsFindReplaceServletProperties([void updates(ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsFindReplaceServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsFindReplaceServletProperties> get serializer => _$ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsFindReplaceServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsFindReplaceServletProperties, _$ComDayCqWcmCoreImplServletsFindReplaceServletProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsFindReplaceServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.scope.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsFindReplaceServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder();
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

