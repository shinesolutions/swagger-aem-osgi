//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone_properties.g.dart';

/// ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [tagpattern] 
/// * [componentPeriodResourceType] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties implements Built<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties, ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'tagpattern')
  ConfigNodePropertyString? get tagpattern;

  @BuiltValueField(wireName: r'component.resourceType')
  ConfigNodePropertyString? get componentPeriodResourceType;

  ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties._();

  factory ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties([void updates(ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties> get serializer => _$ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties, _$ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties object, {
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
    if (object.componentPeriodResourceType != null) {
      yield r'component.resourceType';
      yield serializers.serialize(
        object.componentPeriodResourceType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesBuilder result,
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
        case r'component.resourceType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.componentPeriodResourceType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesBuilder();
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

