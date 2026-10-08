//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_properties.g.dart';

/// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
///
/// Properties:
/// * [cqPeriodPagesupdatehandlerPeriodImageresourcetypes] 
@BuiltValue()
abstract class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties implements Built<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties, ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.pagesupdatehandler.imageresourcetypes')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodImageresourcetypes;

  ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties._();

  factory ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties([void updates(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder b)]) = _$ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties> get serializer => _$ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesSerializer();
}

class _$ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties, _$ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodPagesupdatehandlerPeriodImageresourcetypes != null) {
      yield r'cq.pagesupdatehandler.imageresourcetypes';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodImageresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.pagesupdatehandler.imageresourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodPagesupdatehandlerPeriodImageresourcetypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesBuilder();
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

