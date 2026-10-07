//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties.g.dart';

/// ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
///
/// Properties:
/// * [minThreadPoolSize] 
/// * [maxThreadPoolSize] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties implements Built<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'minThreadPoolSize')
  ConfigNodePropertyInteger? get minThreadPoolSize;

  @BuiltValueField(wireName: r'maxThreadPoolSize')
  ConfigNodePropertyInteger? get maxThreadPoolSize;

  ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties._();

  factory ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties([void updates(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties> get serializer => _$ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties, _$ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.minThreadPoolSize != null) {
      yield r'minThreadPoolSize';
      yield serializers.serialize(
        object.minThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxThreadPoolSize != null) {
      yield r'maxThreadPoolSize';
      yield serializers.serialize(
        object.maxThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'minThreadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minThreadPoolSize.replace(valueDes);
          break;
        case r'maxThreadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxThreadPoolSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder();
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

