//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_info.g.dart';

/// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo implements Built<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties? get properties;

  ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo._();

  factory ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo([void updates(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder b)]) = _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo> get serializer => _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoSerializer();
}

class _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo, _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo];

  @override
  final String wireName = r'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo object, {
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
        specifiedType: const FullType(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties),
          ) as ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties?;
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
  ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoBuilder();
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

