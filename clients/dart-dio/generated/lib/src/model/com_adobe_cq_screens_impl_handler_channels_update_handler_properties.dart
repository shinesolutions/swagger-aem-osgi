//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_impl_handler_channels_update_handler_properties.g.dart';

/// ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
///
/// Properties:
/// * [cqPeriodPagesupdatehandlerPeriodImageresourcetypes] 
/// * [cqPeriodPagesupdatehandlerPeriodProductresourcetypes] 
/// * [cqPeriodPagesupdatehandlerPeriodVideoresourcetypes] 
/// * [cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes] 
/// * [cqPeriodPagesupdatehandlerPeriodPreviewmodepaths] 
@BuiltValue()
abstract class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties implements Built<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.pagesupdatehandler.imageresourcetypes')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodImageresourcetypes;

  @BuiltValueField(wireName: r'cq.pagesupdatehandler.productresourcetypes')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodProductresourcetypes;

  @BuiltValueField(wireName: r'cq.pagesupdatehandler.videoresourcetypes')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodVideoresourcetypes;

  @BuiltValueField(wireName: r'cq.pagesupdatehandler.dynamicsequenceresourcetypes')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes;

  @BuiltValueField(wireName: r'cq.pagesupdatehandler.previewmodepaths')
  ConfigNodePropertyArray? get cqPeriodPagesupdatehandlerPeriodPreviewmodepaths;

  ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties._();

  factory ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties([void updates(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder b)]) = _$ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties> get serializer => _$ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesSerializer();
}

class _$ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties, _$ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodPagesupdatehandlerPeriodImageresourcetypes != null) {
      yield r'cq.pagesupdatehandler.imageresourcetypes';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodImageresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodPagesupdatehandlerPeriodProductresourcetypes != null) {
      yield r'cq.pagesupdatehandler.productresourcetypes';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodProductresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes != null) {
      yield r'cq.pagesupdatehandler.videoresourcetypes';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes != null) {
      yield r'cq.pagesupdatehandler.dynamicsequenceresourcetypes';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths != null) {
      yield r'cq.pagesupdatehandler.previewmodepaths';
      yield serializers.serialize(
        object.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder result,
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
        case r'cq.pagesupdatehandler.productresourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodPagesupdatehandlerPeriodProductresourcetypes.replace(valueDes);
          break;
        case r'cq.pagesupdatehandler.videoresourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes.replace(valueDes);
          break;
        case r'cq.pagesupdatehandler.dynamicsequenceresourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes.replace(valueDes);
          break;
        case r'cq.pagesupdatehandler.previewmodepaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesBuilder();
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

