//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_info.g.dart';

/// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo implements Built<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties? get properties;

  ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo._();

  factory ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo([void updates(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder b)]) = _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo> get serializer => _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoSerializer();
}

class _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo, _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties),
          ) as ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder();
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

