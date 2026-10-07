//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties.g.dart';

/// ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
///
/// Properties:
/// * [filepattern] 
/// * [buildPeriodPagePeriodNodes] 
/// * [buildPeriodClientPeriodLibs] 
/// * [buildPeriodCanvasPeriodComponent] 
@BuiltValue()
abstract class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties implements Built<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties, ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'filepattern')
  ConfigNodePropertyString? get filepattern;

  @BuiltValueField(wireName: r'build.page.nodes')
  ConfigNodePropertyBoolean? get buildPeriodPagePeriodNodes;

  @BuiltValueField(wireName: r'build.client.libs')
  ConfigNodePropertyBoolean? get buildPeriodClientPeriodLibs;

  @BuiltValueField(wireName: r'build.canvas.component')
  ConfigNodePropertyBoolean? get buildPeriodCanvasPeriodComponent;

  ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties._();

  factory ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties([void updates(ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder b)]) = _$ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties> get serializer => _$ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesSerializer();
}

class _$ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties, _$ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties];

  @override
  final String wireName = r'ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.filepattern != null) {
      yield r'filepattern';
      yield serializers.serialize(
        object.filepattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.buildPeriodPagePeriodNodes != null) {
      yield r'build.page.nodes';
      yield serializers.serialize(
        object.buildPeriodPagePeriodNodes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.buildPeriodClientPeriodLibs != null) {
      yield r'build.client.libs';
      yield serializers.serialize(
        object.buildPeriodClientPeriodLibs,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.buildPeriodCanvasPeriodComponent != null) {
      yield r'build.canvas.component';
      yield serializers.serialize(
        object.buildPeriodCanvasPeriodComponent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filepattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filepattern.replace(valueDes);
          break;
        case r'build.page.nodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodPagePeriodNodes.replace(valueDes);
          break;
        case r'build.client.libs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodClientPeriodLibs.replace(valueDes);
          break;
        case r'build.canvas.component':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.buildPeriodCanvasPeriodComponent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder();
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

