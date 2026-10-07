//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties.g.dart';

/// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
///
/// Properties:
/// * [attachmentTypeBlacklist] 
/// * [extensionPeriodOrder] 
@BuiltValue()
abstract class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties implements Built<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder> {
  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyString? get attachmentTypeBlacklist;

  @BuiltValueField(wireName: r'extension.order')
  ConfigNodePropertyInteger? get extensionPeriodOrder;

  ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties._();

  factory ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties([void updates(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder b)]) = _$ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties> get serializer => _$ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesSerializer();
}

class _$ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties, _$ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attachmentTypeBlacklist != null) {
      yield r'attachmentTypeBlacklist';
      yield serializers.serialize(
        object.attachmentTypeBlacklist,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.extensionPeriodOrder != null) {
      yield r'extension.order';
      yield serializers.serialize(
        object.extensionPeriodOrder,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attachmentTypeBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.attachmentTypeBlacklist.replace(valueDes);
          break;
        case r'extension.order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.extensionPeriodOrder.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder();
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

