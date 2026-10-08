//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties.g.dart';

/// ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [tagpattern] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties implements Built<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties, ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'tagpattern')
  ConfigNodePropertyString? get tagpattern;

  ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties._();

  factory ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties([void updates(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties> get serializer => _$ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties, _$ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.tagpattern != null) {
      yield r'tagpattern';
      yield serializers.serialize(
        object.tagpattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'tagpattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tagpattern.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesBuilder();
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

