//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties.g.dart';

/// ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
///
/// Properties:
/// * [guessTotal] 
/// * [tagTitleSearch] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties implements Built<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties, ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'guessTotal')
  ConfigNodePropertyString? get guessTotal;

  @BuiltValueField(wireName: r'tagTitleSearch')
  ConfigNodePropertyBoolean? get tagTitleSearch;

  ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties._();

  factory ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties([void updates(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties> get serializer => _$ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties, _$ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.guessTotal != null) {
      yield r'guessTotal';
      yield serializers.serialize(
        object.guessTotal,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tagTitleSearch != null) {
      yield r'tagTitleSearch';
      yield serializers.serialize(
        object.tagTitleSearch,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'guessTotal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.guessTotal.replace(valueDes);
          break;
        case r'tagTitleSearch':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.tagTitleSearch.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesBuilder();
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

